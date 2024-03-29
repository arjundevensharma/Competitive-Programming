#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int n;
    string s;

    cin >> n >> s;
    
    bool found = false;

    for (int i = 1; i < s.length(); i++) {
        int a [2][2] = {0};
        for (int j = 0; j < i; j++) {
            if (s[j] == 'L') {
                a[0][0] ++;
            } else {
                a[0][1] ++;
            }
        }

        for (int j = i; j < s.length(); j++) {
            if (s[j] == 'L') {
                a[1][0] ++;
            } else {
                a[1][1] ++;
            }
        }

        if (a[1][0] != a[0][0] && a[1][1] != a[0][1]) {
            found = true;
            cout << i;
            break;
        }
    }

    if (found == false) {
        cout << -1;
    }
}
