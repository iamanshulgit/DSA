# https://leetcode.com/problems/power-of-two/solutions/1638707/python-c-java-detailly-explain-why-n-n-1-works-1-line-100-faster-easy/
class isPowerOfTwo:
    def solution_1(self, n: int) -> bool:
        res = 1
        idx = 30
        while idx >= 0:
            if res == n:
                return True
            res = 2 * res
            # print(res)
            idx -=1
        return False
    
    def solution_2(self, n:int) ->bool:
        # so we can find pow(2, n) & (pow(2, n) - 1) == 0
        #     for example, num = 4 = 0b100
        #         4 - 1 = 3 = 0b11
        #         4 & 3 = 0b100 & 0b11 = 0
        #         Amazing, right?
        # But that's not enough! We need to expain that if n is not a power of two then n & n - 1 != 0
        #     If m is not a power of two, then the binary form of m contains more than one 1, that is 0b1x..x10..0, x represents 0 or 1
        #         so m - 1 = 0b1x..x10..0 - 1 = 0b1x..x01..1, that is the first 1 in m is still in the binary form of m - 1, so that m & (m - 1) = 0b1x..x0..0 > 0
        #         for example, m = 6 = 0b110
        #             6 - 1 = 5 = 0b101
        #             6 & 5 = 4 = 0b100 > 0
        #             Did you find it? The bold 1 is still there!!!
        # More generally, for any number n > 0
        #     n & n - 1 removes the last 1 in the binary form of n
        #     if and only if n is a power of two, there is only one 1 in the binary form of n

        return n and not (n & n - 1)


power_of_two = isPowerOfTwo()
solution = power_of_two.solution_1(5)
print(solution)
solution = power_of_two.solution_2(10)
print(solution)

