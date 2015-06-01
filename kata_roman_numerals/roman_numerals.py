import unittest

class myTestSuite(unittest.TestCase):
    def setup(self):
        pass

    def tearDown(self):
        pass

    def number2roman(self, number):
	if(number == 2):
	    return "II"
        return "I" 

    def test_1_return_I(self):
        self.assertEqual(self.number2roman(1), "I")

    def test_2_return_II(self):
        self.assertEqual(self.number2roman(2), "II")
if __name__ == "__main__":
    unittest.main()
