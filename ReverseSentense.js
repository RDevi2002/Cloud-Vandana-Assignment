function reverseWords(sentence) {
    // Split the sentence into an array of words
    var words = sentence.split(" ");

    // Reverse each word in the array
    var reversedWordsArray = words.map(function(word) {
        return word.split("").reverse().join("");
    });

    // Join the reversed words into a new sentence
    var reversedSentence = reversedWordsArray.join(" ");

    return reversedSentence;
}

// Example usage:
var inputSentence = prompt("Enter a sentence:");
var reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);