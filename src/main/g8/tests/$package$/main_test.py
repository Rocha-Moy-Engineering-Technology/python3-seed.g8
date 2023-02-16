from $package$.main import MainAttributes


class TestMain:
    def test_main_automated(self):
        assert MainAttributes.HELLO_WORLD == "Hello World"
