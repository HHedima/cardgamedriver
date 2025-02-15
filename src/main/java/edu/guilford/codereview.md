# Code Review

## `Card` class

- `compareTo()` was finished, no need to keep TODO
- Added Javadoc comments
- Added comments for clarity

## `Deck` class

- Added Javadoc comments
- Added comments for clarity

## `Hand` class

- Added Javadoc comments
- Added comments for clarity

## `LamarckianPoker` class

- `turn` did not check if both hands were above 7, only one.
- `pool` is useless. always returns null
- Added Javadoc comments
- Added comments for clarity

## `Blackjack` class

- `playerTurn()` and `dealerTurn()` is similar and can likely be combined
- Added Javadoc comments
- Added comments for clarity

## `CardGameDriver`

- Occasional error where a random interger is unable to be generated
