import React from 'react';
import { Container, Typography, Grid, Button, Card, CardContent, CardMedia } from '@mui/material';
import BookIcon from '@mui/icons-material/Book';
import Footer from './Footer';

const books = [
  {
    id: 1,
    title: "Girl lost in the story book",
    author: "Roald Dahl",
    image: "image.jpg",
  },
  {
    id: 2,
    title: "Jungle book",
    author: "Beatrix Potter",
    image: "image2.jpg",
  },
  {
    id: 3,
    title: "Hansel & Gretel",
    author: "Maurice Sendak",
    image: "image3.jpg",
  },
  {
    id: 4,
    title: "The doe in the forest",
    author: "E.B. White",
    image: "image4.jpg",
  },
  {
    id: 5,
    title: "The secret garden",
    author: "C.S. Lewis",
    image: "image5.jpg",
  },
  {
    id: 6,
    title: "Classic children's stories",
    author: "J.K. Rowling",
    image: "img3.png",
  },
  // Add more books as needed
];

function Home() {
  return (
    <div style={styles.pageContainer}>
      <Container component="main" style={styles.contentWrap}>
        <Typography variant="h2" gutterBottom align="center">
          Welcome to the Bookshop <BookIcon />
        </Typography>
        <Typography variant="h5" gutterBottom align="center">
          Discover Your Next Great Read
        </Typography>
        <Grid container spacing={4} justifyContent="center">
          {books.map((book) => (
            <Grid item xs={12} sm={6} md={4} key={book.id}>
              <Card>
                <CardMedia
                  component="img"
                  height="290"
                  image={book.image}
                  alt={book.title}
                />
                <CardContent>
                  <Typography variant="h6" gutterBottom>
                    {book.title}
                  </Typography>
                  <Typography variant="body2" color="textSecondary">
                    by {book.author}
                  </Typography>
                </CardContent>
              </Card>
            </Grid>
          ))}
        </Grid>
        <Button variant="contained" color="primary" fullWidth style={{ marginTop: 20 }}>
          Explore More Books
        </Button>
      </Container>
      <Footer />
    </div>
  );
}

const styles = {
  pageContainer: {
    display: 'flex',
    flexDirection: 'column',
    minHeight: '100vh',
  },
  contentWrap: {
    flex: 1,
  },
};

export default Home;
