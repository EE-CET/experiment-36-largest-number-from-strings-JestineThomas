# Experiment 36: Largest Number from Strings

## Problem Statement

Form the largest number by appending a list of strings.

## Input Format

* First line: An integer $N$.
* Second line: $N$ space-separated strings.

## Output Format

* The largest number string.

### Example 1

**Input:**

```text
3
10 3 31
```

**Output:**

```text
33110
```

### Explanation
Possible combinations:
* "10" + "3" + "31" = "10331"
* "3" + "31" + "10" = "33110" (Largest)
* "31" + "10" + "3" = "31103"
