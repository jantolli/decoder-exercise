# decoder-exercise

Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "111122233411" would be encoded as "4132231421".

Let's write a class that implements Iterator interface and is able to iterate over the encoded string to produce a decoded result. Every call to next() method should produce one number at a time. For simplicity, we are only operating with numbers.

Example input sequence #1:
```
1341
```

Example output:
```
31111
```

Example sequence #2:
```
482714
```

Example output:
```
8888774
```
