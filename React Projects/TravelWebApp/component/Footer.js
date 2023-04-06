import React from 'react';
import styles from '../Footer.module.css';

function Footer() {
  return (
    <footer className={styles.footer}>
      <div className={styles.socialMedia}>
        <a href="https://www.facebook.com" className={styles.socialMediaLink}>Facebook</a>
        <a href="https://www.instagram.com" className={styles.socialMediaLink}>Instagram</a>
        <a href="https://www.twitter.com" className={styles.socialMediaLink}>Twitter</a>
      </div>
      <p className={styles.copyRight}>&copy; 2023 Travel Co.</p>
    </footer>
  );
}

export default Footer;