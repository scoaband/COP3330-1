package module05.ch08.p13;

public class IntegerSet {
    /*
    (Set of Integers) Create class IntegerSet. Each IntegerSet object can hold integers in the range 0–100. The set is
    represented by an array of booleans. Array element a[i] is true if integer i is in the set. Array element a[j] is
    false if integer j is not in the set. The no-argument constructor initializes the array to the “empty set” (i.e.,
    all false values).

    Provide the following methods: The static method union creates a set that’s the set-theoretic union of two existing
    sets (i.e., an element of the new set’s array is set to true if that element is true in either or both of the
    existing sets—otherwise, the new set’s element is set to false). The static method intersection creates a set which
    is the set-theoretic intersection of two existing sets (i.e., an element of the new set’s array is set to false if
    that element is false in either or both of the existing sets—otherwise, the new set’s element is set to true).

    Method insertElement inserts a new integer k into a set (by setting a[k] to true).

    Method deleteElement deletes integer m (by setting a[m] to false).

    Method toString returns a String containing a set as a list of numbers separated by spaces. Include only those
    elements that are present in the set. Use --- to represent an empty set.

    Method isEqualTo determines whether two sets are equal.

    Write a program to test class IntegerSet. Instantiate several IntegerSet objects. Test that all your methods work
    properly.
     */
}
