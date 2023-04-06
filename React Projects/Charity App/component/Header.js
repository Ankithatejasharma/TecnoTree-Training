import React from 'react';
import './Header.css';

function Header() {
  return (
    <div className="header">
      <img src={require('./A.jpg')} height='125px' width='125px'/>
      <ul className="menu">
        <li><a href="#">Home</a></li>
        <li><a href="#">Donate</a></li>
        <li><a href="#">Volunteer</a></li>
      </ul>
    </div>
  );
}

export default Header;
