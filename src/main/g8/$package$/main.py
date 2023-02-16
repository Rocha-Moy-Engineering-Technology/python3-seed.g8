from enum import StrEnum, unique


@unique
class MainAttributes(StrEnum):
    HELLO_WORLD = "Hello World"


if __name__ == "__main__":
    print(MainAttributes.HELLO_WORLD)
