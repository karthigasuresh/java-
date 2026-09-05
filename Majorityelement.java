int[] a = {2, 2, 1, 1, 1, 2, 2};

int candidate = 0;
int count = 0;

for (int n : a) {
    if (count == 0)
        candidate = n;

    count += (n == candidate) ? 1 : -1;
}

System.out.println(candidate);
