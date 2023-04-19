const { MongoClient } = require('mongodb');

// Replace the connection string with your MongoDB Atlas connection string
const uri = "mongodb+srv://Ankitha:Ankitha#19@cluster0.x7qwyvy.mongodb.net/?retryWrites=true&w=majority";

// Initialize a new MongoClient instance
const client = new MongoClient(uri);

// Define the database name you want to create
const databaseName = "myNewDatabase";

async function createNewDatabase() {
  try {
  
    await client.connect();

    // Create a new database
    await client.db(databaseName).createCollection("myNewCollection");

    console.log(`Database "${databaseName}" created successfully`);
  } catch (err) {
    console.error(err);
  } finally {
   
    await client.close();
  }
}

createNewDatabase();
