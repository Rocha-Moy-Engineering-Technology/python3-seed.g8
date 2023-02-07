"""main."""

from enum import StrEnum, verify, UNIQUE


@verify(UNIQUE)
class MainAttributes(StrEnum):
    """MainAttributes."""

    HELLO_WORLD = "Hello World"


if __name__ == "__main__":
    print(MainAttributes.HELLO_WORLD)
