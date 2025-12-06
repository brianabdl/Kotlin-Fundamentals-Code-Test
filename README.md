# Kotlin Fundamentals Code Test

A comprehensive coding challenge for learning Kotlin fundamentals, covering:
- Variables and basic types
- Functions and default parameters
- Conditional statements (if-else, when)
- Loops (for, while)
- Collections (List, Set, Map)

### Topics Covered

#### 1. Variables (3 exercises)
- Basic arithmetic operations
- String concatenation
- Type conversions and calculations

#### 2. Functions (3 exercises)
- Multiple parameters
- Default parameters
- Returning multiple values with Pair

#### 3. Conditionals (3 exercises)
- if-else chains
- when expressions
- Complex boolean logic

#### 4. Loops (3 exercises)
- for loops with ranges
- for loops with conditions
- while loops

#### 5. Lists (4 exercises)
- List iteration and accumulation
- Filtering with predicates
- Mapping/transforming elements
- Finding max with nullable types

#### 6. Sets (3 exercises)
- Converting between List and Set
- Union operations
- Intersection operations

#### 7. Maps (4 exercises)
- Frequency counting
- Creating maps from lists
- Map operations with calculations
- Map transformations

### How to Use

1. **Setup**: Share the `Main.kt` file with members
2. **Instructions**: Have them complete the TODO functions
3. **Testing**: They can run tests with:
   ```bash
   ./gradlew test --tests com.gdgoc.unesa.KotlinFundamentalsUnitTest
   ```
4. **Verification**: All 27 tests should pass when correctly implemented

### Getting Started

1. Open `Main.kt` in the `com.gdgoc.unesa` package
2. Find the `KotlinFundamentalsTest` class
3. Complete each function marked with `// TODO: Implement this function`
4. Run the tests to check your solutions

### Tips

- Read the function documentation carefully
- Look at the test cases for examples
- Start with easier sections (Variables, Functions) and progress to harder ones
- Use Kotlin's built-in functions when appropriate (e.g., `filter`, `map`, `sum`)
- Test frequently to catch errors early

### Example Solution Pattern

```kotlin
// Before:
fun sumTwoNumbers(a: Int, b: Int): Int {
    // TODO: Implement this function
    return 0
}

// After:
fun sumTwoNumbers(a: Int, b: Int): Int {
    return a + b
}
```

### Running Tests

**Option 1: Command Line**
```bash
./gradlew test --tests com.gdgoc.unesa.KotlinFundamentalsUnitTest
```

**Option 2: Android Studio**
- Right-click on `KotlinFundamentalsUnitTest` class
- Select "Run 'KotlinFundamentalsUnitTest'"

### Test Results

- ✅ Green: Test passed - your solution is correct!
- ❌ Red: Test failed - review the error message and try again
- Progress: X/27 tests passing

## Learning Outcomes

By completing this test, you will:
- Understand Kotlin's type system and variables
- Master function declarations and parameters
- Use conditional expressions effectively
- Implement different loop types
- Work with Kotlin's collection types
- Apply functional programming concepts (filter, map)
- Handle nullable types safely

## 📚 Resources

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Koans](https://play.kotlinlang.org/koans)
- [Kotlin by Example](https://play.kotlinlang.org/byExample)

Good luck! 🚀

