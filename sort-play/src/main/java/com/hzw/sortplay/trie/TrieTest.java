package com.hzw.sortplay.trie;

/**
 * @author: huangzuwang
 * @date: 2020-06-26 22:12
 * @description:
 */
public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.putWord("abc");
        trie.putWord("abc");
        trie.putWord("abc");
        trie.putWord("abd");
        trie.putWord("bcd");
        trie.putWord("bcd");
        trie.putWord("opq");
        trie.putWord("xyz");
        System.out.println(trie.countByPrex("ab"));
        System.out.println(trie.countByWord("abc"));
        System.out.println(trie.deleteByWord("abc"));
        System.out.println(trie.deleteByWord("abc"));
        System.out.println(trie.deleteByWord("abc"));
        System.out.println(trie.deleteByWord("abc"));
        System.out.println(trie.countByWord("abd"));
    }
}
