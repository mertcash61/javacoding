const num1 = parseFloat(prompt("Enter a number:"));
const num2 = parseFloat(prompt("Enter another number:"));

if(!isNaN(num1) && !isNan(num2)){
    const sum = num1 + num2;
    alert('The sum of${num1} and ${num2} is ${sum}');
} else {
    alert("Please enter valid numbers.");
}