package com.hzw.sortplay.trie;

import java.util.HashMap;

/**
 * @author: huangzuwang
 * @date: 2020-06-26 21:40
 * @description: 前缀树节点
 */
public class TrieNode {

     int pass;

     int end;

     char value;

     HashMap<Integer, TrieNode> nexts = new HashMap<>();
}
