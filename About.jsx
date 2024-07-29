import React from 'react'
import { Container, Typography, Grid, Paper, Box } from '@mui/material';
import { Home as HomeIcon, Info as InfoIcon } from '@mui/icons-material';
import Footer from './Footer';
function About() {
  return (
        <Container>
          <Typography variant="h2" gutterBottom align="center">
            About Us <InfoIcon />
          </Typography>
          <Typography variant="h5" gutterBottom align="center">
            Discover the Story Behind Our Bookstore
          </Typography>
          <Grid container spacing={4}>
            <Grid item xs={12} md={6}>
              <Paper elevation={3} style={{ padding: 20 }}>
                <Typography variant="h6" gutterBottom>
                  Our Story
                </Typography>
                <Typography variant="body1">
                  Welcome to our bookstore! We have been serving book lovers for over a decade, providing a wide range of literature for all ages. Our passion is to spread the joy of reading and connect people with books that inspire and educate.
                </Typography>
                <Box mt={2}>
                  <Typography variant="body1">
                    Our store features a cozy reading nook, a friendly staff ready to recommend your next read, and regular events such as book signings and reading clubs.
                  </Typography>
                </Box>
              </Paper>
            </Grid>
            <Grid item xs={12} md={6}>
              <Paper elevation={3} style={{ padding: 20 }}>
                <Typography variant="h6" gutterBottom>
                  Our Mission
                </Typography>
                <Typography variant="body1">
                  Our mission is to foster a love of reading by offering a diverse selection of books and creating a welcoming space for the community. We believe in the power of books to transform lives and are committed to providing excellent service and support to all our customers.
                </Typography>
              </Paper>
            </Grid>
          </Grid>
          {/* <Box mt={4} textAlign="center">
            <Typography variant="h6">Visit Us or Contact Us</Typography>
            <Typography variant="body1">
              123 Book St, Readsville, RS 45678
            </Typography>
            <Typography variant="body1">
              Phone: (123) 456-7890
            </Typography>
            <Typography variant="body1">
              Email: info@bookstore.com
            </Typography>
            <HomeIcon style={{ marginTop: 10 }} />
          </Box> */}
          <Footer/>
    
        </Container>
  )
}

export default About