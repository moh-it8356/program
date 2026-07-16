#include <bits/stdc++.h>
using namespace std;

int main() {
    int n,fmax,smax=-1,curr;
    cin >> n >> fmax;
    for(int ctr=2;ctr<=n;ctr++){
        cin >> curr;
        if(curr>fmax){ smax=fmax; fmax=curr;}
        else if(curr>smax)  smax=curr;
    }
    cout << fmax <<" "<< smax;
    
}
