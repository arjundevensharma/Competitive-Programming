#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int a, b, xkpos, ykpos, xqpos, yqpos;

void solve () {
    cin >> a >> b >> xkpos >> ykpos >> xqpos >> yqpos;
    
    int knightKPos [8][2] = {
        {xkpos + a, ykpos + b},
        {xkpos + a, ykpos - b},
        {xkpos + b, ykpos + a},
        {xkpos - b, ykpos + a},
        {xkpos - a, ykpos + b},
        {xkpos - a, ykpos - b},
        {xkpos - b, ykpos - a},
        {xkpos + b, ykpos - a}
    };
    
    int knightQPos [8][2] = {
        {xqpos + a, yqpos + b},
        {xqpos + a, yqpos - b},
        {xqpos + b, yqpos + a},
        {xqpos - b, yqpos + a},
        {xqpos - a, yqpos + b},
        {xqpos - a, yqpos - b},
        {xqpos - b, yqpos - a},
        {xqpos + b, yqpos - a}
    };

    set<int> c;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (knightKPos[i][0] == knightQPos[j][0] && knightKPos[i][1] == knightQPos[j][1]) {
                c.insert((knightKPos[i][0] * 10) + knightKPos[i][1]);
                break;
            }
        }
    }

    cout << c.size() << "\n";
}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
