import unittest

class myTestSuite(unittest.TestCase):
    def setup(self):
        pass

    def tearDown(self):
        pass

    def number2roman(self, number):
        return None

    def test_1_return_I(self):
        self.assertEqual(self.number2roman(1), "I")

if __name__ == "__main__":
    unittest.main()
