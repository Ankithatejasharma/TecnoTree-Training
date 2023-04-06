import React, { useState } from "react";
import "./App.css";

const bookData = [
  {
    id: 1,
    title: "To Kill a Mockingbird",
    author: "Harper Lee",
    price: 10.99,
    image:
    require("./book2.jpg"),
  },
  {
    id: 2,
    title: "Pride and Prejudice",
    author: "Jane Austen",
    price: 12.99,
    image:
      require("./book1.jpg"),
  },
  {
    id: 3,
    title: "1984",
    author: "George Orwell",
    price: 9.99,
    image:
      "https://images.penguinrandomhouse.com/cover/9780451524935",
  },
  {
    id: 4,
    title: "The Great Gatsby",
    author: "F. Scott Fitzgerald",
    price: 11.99,
    image:
    require("./book3.jpg"),
  },
  {
    id: 5,
    title: "One Hundred Years of Solitude",
    author: "Gabriel Garcia Marquez",
    price: 14.99,
    image:
      "https://images.penguinrandomhouse.com/cover/9780307474728",
  },
  {
    id: 6,
    title: "The Catcher in the Rye",
    author: "J.D. Salinger",
    price: 13.99,
    image:
    require("./book4.jpg"),
  },
  {
    id: 7,
    title: "Brave New World",
    author: "Aldous Huxley",
    price: 8.99,
    image:
    require("./book5.jpg"),
  },
  {
    id: 8,
    title: "The Picture of Dorian Gray",
    author: "Oscar Wilde",
    price: 10.99,
    image:
      "https://images.penguinrandomhouse.com/cover/9780141442464",
  },
  {
    id: 9,
    title: "The Hobbit",
    author: "J.R.R. Tolkien",
    price: 15.99,
    image:
      "https://images.penguinrandomhouse.com/cover/9780345339683",
  },
  {
    id: 10,
    title: "The Lord of the Rings",
    author: "J.R.R. Tolkien",
    price: 29.99,
    image:
    require("./book6.jpg"),
  },
  {
    id: 11,
    title: "Animal Farm",
    author: "George Orwell",
    price: 7.99,
    image:
      "https://images.penguinrandomhouse.com/cover/9780451526342",
  },
  {
    id: 12,
    title: "Lord of the Flies",
    author: "William Golding",
    price: 9.99,
    image:
      "https://images.penguinrandomhouse.com/cover/9780399501487",
  },
  {
    id: 13,
    title: "The Road",
    author:"Cormac McCarthy",
    price: 12.99,
    image:
    "https://images.penguinrandomhouse.com/cover/9780307387899",
    },
    {
    id: 14,
    title: "The Hitchhiker's Guide to the Galaxy",
    author: "Douglas Adams",
    price: 11.99,
    image:
    "https://images.penguinrandomhouse.com/cover/9780345391803",
    },
    {
      id: 15,
      title: "The Alchemist",
      author: "Paulo Coelho",
      price: 8.99,
      image:
      require("./book7.jpg"),
      },
      {
      id: 16,
      title: "The Da Vinci Code",
      author: "Dan Brown",
      price: 10.99,
      image:
      "https://images.penguinrandomhouse.com/cover/9780385504201",
    },
    {
    id: 17,
    title: "The Girl with the Dragon Tattoo",
    author: "Stieg Larsson",
    price: 13.99,
    image:
    "https://images.penguinrandomhouse.com/cover/9780307269751",
    },
    {
    id: 18,
    title: "The Hunger Games",
    author: "Suzanne Collins",
    price: 9.99,
    image:
    require("./book8.jpg"),
},
{
id: 19,
title: "The Girl on the Train",
author: "Paula Hawkins",
price: 10.99,
image:
"https://images.penguinrandomhouse.com/cover/9781594634024",
},
{
  id: 20,
title: "The Lovely Bones",
author: "Alice Sebold",
price: 7.99,
image:
require("./book9.jpg"),
},
];
function App() {
  const [books, setBooks] = useState(bookData);
  const [cartItems, setCartItems] = useState([]);
  const [wishlistItems, setWishlistItems] = useState([]);

  const handleAddToCart = (book) => {
    setCartItems([...cartItems, book]);
  };

  const handleAddToWishlist = (book) => {
    setWishlistItems([...wishlistItems, book]);
  };

  const handleRemoveFromCart = (book) => {
    const updatedCartItems = cartItems.filter((item) => item.id !== book.id);
    setCartItems(updatedCartItems);
  };

  const handleRemoveFromWishlist = (book) => {
    const updatedWishlistItems = wishlistItems.filter(
      (item) => item.id !== book.id
    );
    setWishlistItems(updatedWishlistItems);
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>Book Sloth</h1>
      </header>
      <div className="book-container">
        {books.map((book) => (
          <div className="book-card" key={book.id}>
            <img src={book.image} alt={book.title} />
            <h2>{book.title}</h2>
            <h3>{book.author}</h3>
            <h4>${book.price}</h4>
            <button onClick={() => handleAddToCart(book)} >Add to Cart</button>
            <button onClick={() => handleAddToWishlist(book)}>
              Add to Wishlist
            </button>
          </div>
        ))}
      </div>
      <div className="cart-container">
        <h2>Cart</h2>
        <ul>
          {cartItems.map((item) => (
            <li key={item.id}>
              {item.title} - ${item.price}
              <button onClick={() => handleRemoveFromCart(item)} class='btn'>Remove</button>
              <button class='btn'>Buy</button>
            </li>
          ))}
        </ul>
      </div>
      <div className="wishlist-container">
        <h2>Wishlist</h2>
        <ul>
          {wishlistItems.map((item) => (
            <li key={item.id}>
              {item.title} - ${item.price}
              <button onClick={() => handleRemoveFromWishlist(item)} class='btn'>Remove</button>
              <button class='btn'>Buy</button>
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
}

export default App;


