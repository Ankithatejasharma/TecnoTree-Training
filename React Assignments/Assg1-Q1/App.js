import React, { useState } from 'react';

const PasswordCheckList = () => {
  const [password, setPassword] = useState('');
  const [passwordErrors, setPasswordErrors] = useState([]);

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
    setPasswordErrors([]);
  };

  const checkPassword = () => {
    const errors = [];
    if (password.length < 8) {
      errors.push('Password must be at least 8 characters long');
    }
    if (!password.match(/[A-Z]/)) {
      errors.push('Password must contain at least one uppercase letter');
    }
    if (!password.match(/[a-z]/)) {
      errors.push('Password must contain at least one lowercase letter');
    }
    if (!password.match(/[0-9]/)) {
      errors.push('Password must contain at least one number');
    }
    setPasswordErrors(errors);
  };

  return (
    <div>
      <h1>PASSWORD CHECK LIST</h1>
      <label htmlFor="password">Password:</label>
      <input type="password" id="password" value={password} onChange={handlePasswordChange} /><br></br>
      <button onClick={checkPassword}>Check Password</button>
      {passwordErrors.length > 0 && (
        <ul>
          {passwordErrors.map((error) => (
            <li key={error}>{error}</li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default PasswordCheckList;
