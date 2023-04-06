import React from 'react';
import './Volunteer.css';

function Volunteer() {
  return (
    <div className="volunteer">
      <h2>Volunteer</h2>
      <p>We are always looking for volunteers to help us make a difference in the world.</p>
      <form action='action.php'>
        <input type='text' name='name' id='name' placeholder='Your Name' required/><br/>
        <input type='email' name='email' id='email' placeholder='Your Mail Id' required/><br/>
        <textarea placeholder='Why would you like to volunteer!?'></textarea><br/>
        <button id='btn'>Volunteer!!</button>
      </form>
    </div>
  );
}

export default Volunteer;
