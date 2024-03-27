#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int dx[8] = {-1, -1, -1, 0, 0, 1, 1, 1};
    int dy[8] = {-1, 0, 1, -1, 1, -1, 0, 1};

    string a[3];

    for (int i = 0; i < 3; i++) {
        cin >> a[i];
    }

    string smallest = "DDD";

    string s;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            s = a[i][j];

            if ( a[i][j] <= smallest[0] ) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        int ind1x = j + dx[k];
                        int ind1y = i + dy[k];
                        int ind2x = j + dx[k] + dx[l];
                        int ind2y = i + dy[k] + dy[l];

                        if (ind1x >= 0 && ind2x >= 0 && ind1y >= 0 && ind2y >= 0 && ind1x < 3 && ind2x <3 && ind1y <3 && ind2y < 3 && !(j == ind2x && i == ind2y) ) {
                            s += a[ind1y][ind1x];
                            s += a[ind2y][ind2x];

                            if (s.compare(smallest) < 0) {
                                smallest = s;
                            }
                        }

                        s = a[i][j];
                    }
                }
            }
        }
    }

    cout << smallest;
}
