package intro;

import java.util.HashMap;
import java.util.Map;

/*You are given an array of strings names representing filenames. The array is sorted in order of file creation, such that names[i]
represents the name of a file created before names[i+1] and after names[i-1] (assume 0-based indexing). Because all files must have unique names,
files created later with the same name as a file created earlier should have an additional (k) suffix in their names,
where k is the smallest positive integer (starting from 1) that does not appear in previous file names.

        Your task is to iterate through all elements of names (from left to right) and update all filenames based on the above. Return an array of proper filenames.

        Example

        For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

        Since names[0] = "doc" and names[1] = "doc", update names[1] = "doc(1)"
        Since names[1] = "doc(1)" and names[3] = "doc(1)", update names[3] = "doc(1)(1)"
        Since names[0] = "doc", names[1] = "doc(1)", and names[4] = "doc", update names[4] = "doc(2)"
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.string names

        Guaranteed constraints:
        5 ≤ names.length ≤ 1000,
        1 ≤ names[i].length ≤ 15.

        [output] array.string*/
public class FileNaming {
    String[] solution(String[] names) {
        Map<String, Integer> m = new HashMap<>();
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (!m.containsKey(name)) {
                m.put(names[i], 1);
                res[i] = names[i];
            }
            else {
                int nextId = m.get(name);
                String next = name + "(" + nextId + ")";

                while (m.containsKey(next)) {
                    nextId++;
                    next = name + "(" + nextId + ")";
                }

                m.put(next, 1);
                m.put(name, nextId + 1);
                res[i] = next;
            }
        }

        return res;

    }
}
