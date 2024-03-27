#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve () {
    string s;

    cin >> s;
    vector <int> lower, upper;
    
        string newString;
    
    for (char c: s) {

        if (c == 'b') {
            if (!lower.empty() ) {
                newString[lower.back()] = '\0';
                lower.pop_back();
            }
        } else if (c == 'B') {
            if(!upper.empty()) {
                newString[upper.back()] = '\0';
                upper.pop_back();
            }
        } else {
            newString += c;
            if (c >= 'a' && c <= 'z') {
                lower.push_back(newString.size() - 1);
            } else {
                upper.push_back(newString.size() - 1);
            }
        }
    }

    for (char c: newString) if (c != '\0') cout << c;

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
