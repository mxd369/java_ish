class kindsoferrorchecking2 {
    int big = 200000;
    big = big * big;
}

/*
EXPLANATION

This is an integer overflow,
because an int value can't represent a number bigger than 231 (about 2 billion).
It isn't caught statically, but unfortunately in Java it isn't caught dynamically either.
Integer overflows quietly produce the wrong answer.
*/