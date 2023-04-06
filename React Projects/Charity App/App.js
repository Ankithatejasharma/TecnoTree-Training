import React from 'react';
import Header from './component/Header';
import Home from './component/Home';
import Donate from './component/Donate';
import Volunteer from './component/Volunteer';
import Footer from './component/Footer';


function App() {
  return (
    <div className="App">
      <Header />
      <Home />
      <Donate />
      <Volunteer />
      <Footer/>
    </div>
  );
}

export default App;
