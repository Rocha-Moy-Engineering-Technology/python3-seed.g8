"""$package$.main_test."""

from $package$.main import MainAttributes


class TestMain:
    """TestMain."""

    def test_main_automated(self):
        """test_main_automated."""
        assert MainAttributes.HELLO_WORLD == "Hello World"
