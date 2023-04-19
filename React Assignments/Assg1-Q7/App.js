import React, { Component } from "react";

class NasaData extends Component {
  constructor(props) {
    super(props);

    this.state = {
      data: null,
      loading: true,
      error: null,
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch(
        "https://api.nasa.gov/planetary/apod?api_key=CzE8ZVX3adxexgFxqvPlC8djeJeKLWgspuD5mxEU"
      );

      if (!response.ok) {
        throw Error(response.statusText);
      }

      const data = await response.json();

      this.setState({ data, loading: false });
    } catch (error) {
      this.setState({ error, loading: false });
    }
  }

  render() {
    const { data, loading, error } = this.state;

    if (loading) {
      return <div>Loading...</div>;
    }

    if (error) {
      return <div>Error: {error.message}</div>;
    }

    return (
      <div>
        <h1>{data.title}</h1>
        <center><img src={data.url} alt={data.title}  height='500px' width='500px'/></center>
        <p>{data.explanation}</p>
      </div>
    );
  }
}

export default NasaData;
