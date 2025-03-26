package com.app.dsalgo.hashing.implemetation;

import java.util.*;
public class HashMapImplementation {

    static class HashMap<K,V> {
        private class Nodes {
            K key;
            V value;
            public Nodes(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // linked list size n = Node
        private int N; // Array size means Bucket length
        private LinkedList<Nodes> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>(); // create empty linkedlist for each Array index
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // find bucket index for the key, return bucket index = bi
            int di = searchInLL(key, bi); // to find key is exist on bucket index or not, return data index = di
            if(di == -1) { // key doesn't exist
                buckets[bi].add(new Nodes(key, value)); // if key is not there then add new node with ke and value on the bucket index (bi) in linkedList
                n++; // increase the node value for linkedlist - linkedlist size
            } else { // key exist
                Nodes node = buckets[bi].get(di); // if key is there then return data on the data index for the bucket index
                node.value = value; // update the value for the key in linked list
            }

            // now check lambda value should not greater then N, if yes then do rehashing
            double lambda = (double) n / N;
            double K = 2.0;
            if(lambda > K) { // if lambda > k = constant
                // then do rehashing
                rehashing();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) { // key doesn't exist
                return null;
            } /*else { // key exist
                Nodes node = buckets[bi].get(di);
                return node.value;
            }*/
            Nodes node = buckets[bi].get(di);
            return node.value;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) { // key doesn't exist
                return false;
            }
            return true;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) { // key doesn't exist
                return null;
            }
            Nodes node = buckets[bi].remove(di);
            n--;
            return node.value;

        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < N; i++) { // bi = bucket index
                LinkedList<Nodes> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++) {
                    Nodes nodes = ll.get(j);
                    keys.add(nodes.key);
                }
            }
            return keys;
        }

        private int hashFunction(K key) {
            int bi = key.hashCode(); // inbuild hashcode funtion can return any + or - value, so take mode of the value
            return Math.abs(bi) % N; //  take reminder with N coz value should be between 0 - N-1;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Nodes> linkedList = buckets[bi]; // return linkedList on the specific bi
            for(int i = 0; i < linkedList.size(); i++) { // traverse to linked list to get di
                if(linkedList.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void rehashing() {
            // store old bucket first
            LinkedList<Nodes> oldBucket[] = buckets;
            buckets = new LinkedList[N*2]; // create new bucket


            // create empty linkedlist
            for(int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }
            // store old nodes into new bucket - copy one array to another array
            for(int i = 0; i < oldBucket.length; i++) {
                LinkedList<Nodes> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++) {
                    Nodes node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("India", 190);
        myMap.put("China", 200);
        myMap.put("Pakistan", 100);
        myMap.put("US", 50);

        ArrayList<String> keys = myMap.keySet();
        for(int i = 0; i < keys.size(); i++) {
            System.out.print("Key is : " + keys.get(i) + ":  And  : " + "value is : " + myMap.get(keys.get(i)));
            git sttausSystem.out.println();
        }

        myMap.remove("India");
        System.out.println(myMap.get("India"));

    }
}
