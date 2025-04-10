# PeterAssignment

The project has been compiled and can read a text file and list the 10 words by occurrence (and the number of time each appears in the file).

To run the program, 
1. go to the director: ~/ShakespearAssignment/target/classes
2. type the command: java com.example.Main
3. it will ask you to input the file path of the input text file.
4. If you correctly input the file, it will print out the top 10 words by occurrence.

like:

root@dcs-1b4641b9-0:/workspace/ShakespearAssignment/target/classes# java com.example.Main
Please input the file name: 
/workspace/ShakespearAssignment/text.txt                     
Loading the file.../workspace/ShakespearAssignment/text.txt
finish the file loading.
 the top words are: 
The word 'the' appears 8809 times.
The word 'and' appears 8468 times.
The word 'of' appears 6125 times.
The word 'to' appears 5763 times.
The word 'i' appears 5290 times.
The word 'a' appears 3924 times.
The word 'my' appears 3897 times.
The word 'in' appears 3317 times.
The word 'that' appears 3060 times.

The project was based on Maven and have limited unit tests.

It also has the below limitations:
1. All words are counting in lower case.  But some words, uppercase and lowercase have different meanings.  For example, China is country name but china means dishware made of high quality porcelain.  This assignment cannot distinguish them and consider them the same word.
2. It cannot handle the words containing numbers.  For example, H2O, it will consider it as two words: H and O.
3. Abbreviations are treated as separate words.  For example, 've is not counted into the occurrence of 'have' but the word "'ve".

