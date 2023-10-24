function SortArrayDescending(array) {
    
    array.sort(function(a, b) {
        return b - a;
    });

    return array;
}


var input = prompt("Enter the elements of the array, separated by commas:");
var inputArray = input.split(",").map(function(item) {
    return parseInt(item.trim());
});

var sortedArray = sortArrayDescending(inputArray);
console.log(sortedArray);