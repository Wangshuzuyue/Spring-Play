package com.hzw.sortplay.trie;

/**
 * @author: huangzuwang
 * @date: 2020-06-26 21:42
 * @description: 前缀树
 */
public class Trie {

    private TrieNode head;

    public void putWord(String word){
        if (word == null || word.length() == 0){
            return;
        }
        char[] chars = word.toCharArray();
        if (head == null){
            head = new TrieNode();
            head.value = chars[0];
        }
        TrieNode prev = head;
        TrieNode node;
        for (int i = 0; i < chars.length; i++){
            node = prev.nexts.get((int)chars[i]);
            char value = chars[i];
            if (node == null){
                node = new TrieNode();
                node.value = value;
                node.pass = 1;
                prev.nexts.put((int)value, node);
            }else{
                node.pass += 1;
            }
            if (i == chars.length - 1){
                //尾字符
                node.end += 1;
            }
            prev = node;
        }
    }

    /**
     * 根据前缀获取个数
     * @param prex
     * @return
     */
    public int countByPrex(String prex){
        int count = 0;
        if (prex == null || prex.length() == 0){
            return 0;
        }
        char[] chars = prex.toCharArray();
        TrieNode prev = head;
        for (int i = 0; i < chars.length; i++){
            TrieNode node = prev.nexts.get((int)chars[i]);
            if (node == null) {
                return 0;
            }
            if (i == chars.length - 1){
                //尾字符
                count = node.pass;
            }
            prev = node;
        }
        return count;
    }

    /**
     * 根据单词获取个数
     * @param word
     * @return
     */
    public int countByWord(String word){
        int count = 0;
        if (word == null || word.length() == 0){
            return 0;
        }
        char[] chars = word.toCharArray();
        TrieNode prev = head;
        for (int i = 0; i < chars.length; i++){
            TrieNode node = prev.nexts.get((int)chars[i]);
            if (node == null) {
                return 0;
            }
            if (i == chars.length - 1){
                //尾字符
                count = node.end;
            }
            prev = node;
        }
        return count;
    }

    public int deleteByWord(String word){
        int delete = 0;
        if (word == null || word.length() == 0){
            return 0;
        }
        char[] chars = word.toCharArray();
        if (head == null){
            head = new TrieNode();
            head.value = chars[0];
        }
        TrieNode prev = head;
        TrieNode node;
        for (int i = 0; i < chars.length; i++){
            node = prev.nexts.get((int)chars[i]);
            char value = chars[i];
            if (node == null){
                return 0;
            }
            if (i == chars.length - 1){
                //尾字符
                if ((node.pass -= 1) == 0 & (node.end -= 1) == 0){
                    prev.nexts.remove((int)value);
                }
                delete = 1;
            }
            prev = node;
        }
        return delete;
    }

}
