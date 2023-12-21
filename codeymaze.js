const users = {
    { id: 1, name: "John", age: 30 },
    { id: 2, name: "Miley", age: 31 },
    { id: 3, name: "Tracey", age: 28 },
    { id: 4, name: "Ivan", age: 3290 },
};
// Find users with age less than 30

const userlist = user.find((user) => user.age < 30);
console.log(userlist);
// { id: 3, name: "Tracey", age: 28}