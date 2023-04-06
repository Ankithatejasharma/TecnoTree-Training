import React from 'react';
import './Donate.css';

function Donate() {
  return (
    <div className="donate">
      <h2>Donate</h2>
      <p>Please consider making a donation to help us support those in need.</p>
      <form action='pay.php'>
        <input type='text' name='name' id='name' placeholder='Your Name' required/><br/>
        <input type='email' name='email' id='email' placeholder='Your Mail Id' required/><br/>
        <input type='password' name='card' id='card' placeholder='Your card Number' required/><br/>
        <input type='number' name='amt' id='amt' placeholder='Amount' required/><br/>
        <button id='btn'>Pay</button>
      </form>
    </div>
  );
}

export default Donate;
