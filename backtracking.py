def lettercombinations(digits : str):
    res = []
    """
    digitstoChar ={'2' :'abc',
                   '3':'def',
                   '4':'ghi',
                   '5':'jkl',
                   '6':'mno',
                   '7':'pqrs',
                   '8':'tuv',
                   '9':'wxyz'}
                    dic!
                   
    """
    def mappinglist(dig):
        offset = 0
        rangeoffset= 0
        if dig in ['8' , '9']:
            offset = 1
        if  dig in['7','9']:
            rangeoffset = 1
        i = int(dig) - 2 
        chars =[chr(ord('a') + 3 * i + j + offset) for j in range(3 + rangeoffset)]
        return chars
            
    def backtracking(i , curString):
        if(len(curString) == len(digits)):
            res.append(curString)
            return
        for c in mappinglist(digits[i]):
            backtracking(i + 1 , curString + c)

    if digits:
        backtracking(0,"");

        return res

if __name__ == "__main__":
    digits = '234'
    li = lettercombinations(digits)
    print(li)
   
