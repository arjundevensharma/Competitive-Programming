#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int g[5][5];

    int s = 0;

    for (int i = 0; i < 5; ++i) {
        for (int j = 0; j < 5; ++j) {
            cin >> g[j][i];

            if (g[j][i] == 1) {
                s += abs(2 - j);
                s += abs(2 - i);
                break;
            }
        }
    }

    cout << s;
}
