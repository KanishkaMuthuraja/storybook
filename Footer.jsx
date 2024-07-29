import React from 'react';

const Footer = () => {
  return (
    <footer style={styles.footer}>
      <p>© 2024 Children's Store Books. Contact us</p>
      <p>cbooks@gmail.com</p>
      <p>Phone: 9745363456</p>
    </footer>
  );
};

const styles = {
  footer: {
    backgroundColor: '#282c34',
    color: 'white',
    textAlign: 'center',
    padding: '1rem',
  },
};

export default Footer;
