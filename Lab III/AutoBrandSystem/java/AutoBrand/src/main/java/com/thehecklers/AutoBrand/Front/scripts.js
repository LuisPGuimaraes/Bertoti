document.addEventListener('DOMContentLoaded', () => {
    const addBrandForm = document.getElementById('addBrandForm');
    const updateBrandForm = document.getElementById('updateBrandForm');
    const deleteBrandForm = document.getElementById('deleteBrandForm');
    const getBrandForm = document.getElementById('getBrandForm');
    const loadBrandsBtn = document.getElementById('loadBrandsBtn');
    const allBrandsDiv = document.getElementById('allBrands');
    const brandResultDiv = document.getElementById('brandResult');

    const apiUrl = 'http://localhost:8080/brands';

    // Add Brand
    addBrandForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const name = document.getElementById('name').value;
        const country = document.getElementById('country').value;
        const abbreviation = document.getElementById('abbreviation').value;

        const response = await fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ name, country, abbreviation }),
        });

        if (response.ok) {
            alert('Brand added successfully');
            addBrandForm.reset();
        } else {
            alert('Error adding brand');
        }
    });

    // Update Brand
    updateBrandForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const abbreviation = document.getElementById('updateAbbreviation').value;
        const name = document.getElementById('updateName').value;
        const country = document.getElementById('updateCountry').value;
        const newAbbreviation = document.getElementById('updateNewAbbreviation').value;

        const response = await fetch(`${apiUrl}/${abbreviation}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ name, country, abbreviation: newAbbreviation }),
        });

        if (response.ok) {
            alert('Brand updated successfully');
            updateBrandForm.reset();
        } else {
            alert('Error updating brand');
        }
    });

    // Delete Brand
    deleteBrandForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const abbreviation = document.getElementById('deleteAbbreviation').value;

        const response = await fetch(`${apiUrl}/${abbreviation}`, {
            method: 'DELETE',
        });

        if (response.ok) {
            alert('Brand deleted successfully');
            deleteBrandForm.reset();
        } else {
            alert('Error deleting brand');
        }
    });

    // Get Brand by Abbreviation
    getBrandForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const abbreviation = document.getElementById('getAbbreviation').value;

        const response = await fetch(`${apiUrl}/${abbreviation}`);
        const brands = await response.json();

        brandResultDiv.innerHTML = '';
        if (brands.length > 0) {
            brands.forEach(brand => {
                const brandDiv = document.createElement('div');
                brandDiv.className = 'brand';
                brandDiv.textContent = `Name: ${brand.name}, Country: ${brand.country}, Abbreviation: ${brand.abbreviation}`;
                brandResultDiv.appendChild(brandDiv);
            });
        } else {
            brandResultDiv.textContent = 'No brands found';
        }
    });

    // Load All Brands
    loadBrandsBtn.addEventListener('click', async () => {
        const response = await fetch(apiUrl);
        const brands = await response.json();

        allBrandsDiv.innerHTML = '';
        brands.forEach(brand => {
            const brandDiv = document.createElement('div');
            brandDiv.className = 'brand';
            brandDiv.textContent = `Name: ${brand.name}, Country: ${brand.country}, Abbreviation: ${brand.abbreviation}`;
            allBrandsDiv.appendChild(brandDiv);
        });
    });
});
