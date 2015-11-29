[![Build Status](https://travis-ci.org/wlk/mutation-testing-demo.svg?branch=master)](https://travis-ci.org/wlk/mutation-testing-demo)

Demo that shows how to use PIT - mutation testing framework:

run tests:
```bash
./gradlew test
```

run PIT:
```bash
./gradlew pitest
```

Then analyze the results in:
```
build/reports/pitest/...
```