/*ct
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methjeods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

public class ReclamationProject {
    static String doit(String shorter, String longer) {
        if (shorter.length() > longer.length()) {
            String swapper = shorter;
            shorter = longer;
            longer = swapper; // longer is now the larger string and shorter is the shorter String
            }
        String r = ""; // Empty String
        /*
         * Look at this mess below.
         */
        for (int i = 0; i < shorter.length(); i++) {
            for (int j = shorter.length() - i; j > 0; j--) {
                for (int k = 0; k < longer.length() - j; k++) {
                    r = (shorter.regionMatches(i, longer, k, j) && j > r.length())
                            ? shorter.substring(i, i + j) : r;
                        }
                }
        }
        return r; }
}
