let arr = [
    "김태환", "권지훈", "박병찬", "박진국", "서영훈", "성제현",
    "안민영", "오희재", "유현준", "정서연", "하민성", "한민혁", "홍다희"
];

function shuffleArray(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
}

function getRandomItems(array, num) {
    let shuffled = shuffleArray(array.slice());
    return shuffled.slice(0, num);
}

function printRandomItems(num) {
    let randomItems = getRandomItems(arr, num);
    console.log(`무작위로 추출된 ${num}명:`, randomItems);
}

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('텍스트를 입력하세요: ', (answer) => {
    printRandomItems(answer);
    rl.close();
});
