
def permutate(nums):
    
    if len(nums) == 1:
        return [nums[:]]
    result = []
    for i in range(len(nums)):
        n = nums.pop(0)
        perms = permutate(nums)
        for perm in perms:
            perm.append(n)
        result.extend(perms)
        nums.append(n)
        
    return result
    


def main():
    print(permutate([1,2,3]))


if __name__=="__main__":   
    main()
