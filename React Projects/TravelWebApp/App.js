import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Header from './component/Header';
import Hero from './component/Hero';
import Packages from './component/Packages';
import Footer from './component/Footer';

function App() {
  return (
    <BrowserRouter>
      <Header />
      <Switch>
        <Route exact path="/">
          <Hero />
        </Route>
        <Route path="/packages">
          <Packages />
        </Route>
        <Route path="/about">
          <h1>About Page</h1>
        </Route>
        <Route path="/contact">
          <h1>Contact Page</h1>
        </Route>
      </Switch>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
