import React, { useState } from 'react';
import './App.css';

function App() {
  const [courses, setCourses] = useState([
    {
      id: 1,
      title: "Introduction to React.js",
      image: require("./react3.png"),
      description: "In this course, you will learn the basics of React.js and how to create dynamic user interfaces."
    },
    {
      id: 2,
      title: "HTML and CSS Fundamentals",
      image:  require("./html.png"),
      description: "In this course, you will learn the basics of HTML and CSS and how to create beautiful and responsive web pages."
    },
    {
      id: 3,
      title: "JavaScript for Beginners",
      image:  require("./js.png"),
      description: "In this course, you will learn the basics of JavaScript and how to create interactive web applications."
    },
    {
      id: 4,
      title: "Python for Data Science",
      image:  require("./py.png"),
      description: "In this course, you will learn Python programming and how to analyze and visualize data using popular libraries like NumPy and Pandas."
    },
    {
      id: 5,
      title: "Full-Stack Web Development",
      image:  require("./fs.png"),
      description: "In this course, you will learn the basics of front-end and back-end web development and how to create full-stack web applications."
    },
    {
      id: 6,
      title: "Introduction to Machine Learning",
      image:  require("./ml.png"),
      description: "In this course, you will learn the basics of machine learning and how to build and train predictive models using popular libraries like TensorFlow and Scikit-Learn."
    },
    {
      id: 7,
      title: "Java Programming",
      image:  require("./java.png"),
      description: "In this course, you will learn Java programming and how to build Java applications for various platforms and use cases."
    },
    {
      id: 8,
      title: "Mobile App Development",
      image:  require("./mad.png"),
      description: "In this course, you will learn how to create mobile apps for iOS and Android using popular frameworks like React Native and Flutter."
    },
    {
      id: 9,
      title: "Cloud Computing Fundamentals",
      image:  require("./cloud.jpg"),
      description: "In this course, you will learn the basics of cloud computing and how to deploy and manage applications in cloud environments like AWS and Azure."
    },
    {
      id: 10,
      title: "Data Structures and Algorithms",
      image:  require("./dsa.jpg"),
      description: "In this course, you will learn the fundamentals of data structures and algorithms and how to solve complex problems using efficient algorithms and data structures."
    }
  ]);
    return (
      <div className="app">
        <header>
          <h1>Progress Zone</h1>
        </header>
        <h2>Courses</h2>
        <main>
          
          <ul class='course'>
            {courses.map(course => (
              <li key={course.id}>
              <img src={course.image} alt={course.title} />
              <h3>{course.title}</h3>
              <p>{course.description}</p>
              <button>Enroll Now</button>
            </li>
          ))}
        </ul>
      </main>
      <footer>
        <p>Developed by Ankitha Teja Sharma.<br/>&copy; 2023 Progress Zone</p>
      </footer>
    </div>
  );
}

export default App;

