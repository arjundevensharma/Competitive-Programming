#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n;

void solve () {
    cin >> n;

    if (n % 3 == 0)
        cout << "Second\n";
    else   
        cout << "First\n";
}
int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
