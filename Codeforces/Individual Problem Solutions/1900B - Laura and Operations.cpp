#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int a, b, c;

void solve () {
    cin >> a >> b >> c;

    if (b == c || (abs(b - c) % 2 == 0) )
        cout << 1 << " ";
    else
        cout << 0 << " ";

    if (a == c || (abs(a - c) % 2 == 0) )
        cout << 1 << " ";
    else
        cout << 0 << " ";

    if (a == b || (abs(a - b) % 2 == 0) )
        cout << 1 << "\n";
    else
        cout << 0 << "\n";
}
int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
