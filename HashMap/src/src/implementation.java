import java.util.*;

public class implementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key,V value) {
                this.value = value;
                this.key = key;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();

            }

        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N* 2];

            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();

            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key , V value){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
               Node node =  buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0){

            }

        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1){
                return false;
            }
            else{
                return true;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1){
                return null;
            }
            else{
                Node node =  buckets[bi].get(di);
                return node.value;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1){
                return null;
            }
            else{
                Node node =  buckets[bi].remove(di);
                return node.value;
            }
        }

        public boolean isEmpty(){
          return n == 0;
        }


    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        System.out.println(map.get("India"));

        map.remove("China");
        System.out.println(map.get("China"));

    }
}
