#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array

int n;

void solve () {
    cin >> n;

    vector<int> a(n);

    for (int i = 0; i < n; i++) cin >> a[i];

    vector<int> b(n, 1);

    vector <vector<int>> inds (101);

    for (int i = 0; i < n; i++) {
        inds[a[i]].push_back(i);
    }

    int numOccs = 0;

    for (int i = 0; i < 101; i++) {
        if (inds[i].size() >= 2) {
            numOccs ++;
            b[inds[i][0]] = numOccs + 1;
        }

        if (numOccs >= 2) {
            break;
        }
    }

    if (numOccs < 2)
        cout << -1;
    else 
        for (int i = 0;i < n; i++) cout << b[i] << " ";
    
    cout << "\n";
}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;
    
    while (t--)
        solve();
}
