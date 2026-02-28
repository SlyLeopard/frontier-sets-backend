db = db.getSiblingDB("trainers");

db.trainers.insertMany([
  { index: 1, name: "Jim", class: "Youngster", rank: 1},
  { index: 2, name: "Erroll", class: "Youngster", rank: 2}
]);