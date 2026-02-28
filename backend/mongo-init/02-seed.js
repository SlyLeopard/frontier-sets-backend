// Seed script for Battle Frontier trainers
// Will run automatically on first container startup

// Use environment variables
const dbName = process.env.MONGO_DB || "frontier-sets";
const username = process.env.MONGO_USER || "test";
const password = process.env.MONGO_PASS || "test";

db = db.getSiblingDB(dbName);

// Authenticate as root user if needed
db.auth(username, password);

// Seed trainers collection
db.trainers.insertMany([
  { index: 1, name: "Jim", class: "Youngster", rank: 1 },
  { index: 2, name: "Erroll", class: "Youngster", rank: 1 },
]);